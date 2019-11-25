package com.felt.coporation.springdemo.service;

import com.felt.coporation.springdemo.entity.Author;
import com.felt.coporation.springdemo.repository.AuthorRepository;
import com.sun.xml.messaging.saaj.packaging.mime.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import javax.mail.internet.MimeMessage;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BuildDummyDataAuthor buildDummyDataAuthor;

    @Autowired
    private JavaMailSender javaMailSender;

    public List<Author> getAll() {
        System.out.println("Sending Email...");

        try {

            //sendEmail();
            //sendEmailWithAttachment();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Done");
        return authorRepository.findAll();
    }

    public List<Author> buildDummyData() {
        return buildDummyDataAuthor.buildDummyData();
    }

    public void sendEmail() throws Exception {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper( message, true );

        helper.setTo("tmsclientdn@gmail.com");
        helper.setText("Hello,\nI'm admin of TMS system.\nYour account is active now.\nThank you.");
        helper.setSubject("Activate your account");

        javaMailSender.send(message);
    }
}

create table post (
    id int PRIMARY KEY
)

-- /
-- create table vertex
--     (vertex_id number generated always as identity
--      , side varchar2(10) not null unique
--      , constraint vertex_pk  primary key (vertex_id) )
-- /
-- create table polygon_vertices
--     (polygon_id number not null
--      , vertex_id number not null
--      , constraint polygon_vertices_uk unique (polygon_id, vertex_id)
--      , constraint polygon_vertices_polygon_fk foreign key (polygon_id) references polygon (polygon_id)
--      , constraint polygon_vertices_vertex_fk foreign key (vertex_id) references vertex(vertex_id)
--      )
-- /
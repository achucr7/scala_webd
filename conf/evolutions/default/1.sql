# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table cform (
  firstname                     varchar2(255) not null,
  lastname                      varchar(255),
  age                           integer,
  email                        varchar(255) not null ,
  date                         date,
  country                       varchar2(255),
  constraint pk_form primary key (email)
);
create sequence form_seq;


# --- !Downs

drop table if exists cform;
drop sequence if exists form_seq;


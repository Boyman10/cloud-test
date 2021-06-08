CREATE TABLE IF NOT EXISTS micro_user
(
    id         serial      NOT NULL PRIMARY KEY,
    username   varchar(30) NOT NULL,
    email      varchar(50) NOT NULL,
    first_name varchar(30),
    last_name  varchar(30),
    created_at timestamp   not null
);

CREATE UNIQUE INDEX IF NOT EXISTS username_idx ON micro_user (username);
CREATE UNIQUE INDEX IF NOT EXISTS email_idx ON micro_user (email);
CREATE UNIQUE INDEX IF NOT EXISTS first_last_idx ON micro_user (first_name, last_name);

CREATE TABLE IF NOT EXISTS micro_company
(
    id             serial       NOT NULL PRIMARY KEY,
    identification varchar(100) NOT NULL UNIQUE,
    name           varchar(30)  NOT NULL UNIQUE,
    created_at     timestamp    not null
);

CREATE TABLE IF NOT EXISTS micro_user_company
(
    user_id    integer NOT NULL REFERENCES micro_user (id),
    company_id integer NOT NULL REFERENCES micro_company (id),
);



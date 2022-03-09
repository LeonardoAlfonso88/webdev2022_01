CREATE TABLE IF NOT EXISTS ProductSystem.users (
    id              CHAR(36) NOT NULL,
    name            VARCHAR(150) NOT NULL,
    email           VARCHAR(150) NOT NULL,
    isSeller        BOOLEAN default 0 NOT NULL,
    balance         DOUBLE NOT NULL,
    rating          DOUBLE NOT NULL,
    password        VARCHAR(150) NOT NULL,
    address         JSON default '[]' NOT NULL,
    PRIMARY KEY (id)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8mb4
    COLLATE = utf8mb4_unicode_ci;
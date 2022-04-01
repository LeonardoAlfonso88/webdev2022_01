CREATE TABLE IF NOT EXISTS ProductSystem.address (
    id              CHAR(36) NOT NULL,
    city            VARCHAR(150) NOT NULL,
    detail          VARCHAR(150) NOT NULL,
    additionalInfo  VARCHAR(500) NOT NULL,
    postalCode      VARCHAR(10) NOT NULL,
    neighborhood    VARCHAR(100) NOT NULL,
    userId          CHAR(36) NOT NULL,
    PRIMARY KEY (id)
    )
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8mb4
    COLLATE = utf8mb4_unicode_ci;
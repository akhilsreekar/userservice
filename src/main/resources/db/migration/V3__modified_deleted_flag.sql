ALTER TABLE userservice.`role`
    ADD deleted BIT(1) NULL;

ALTER TABLE userservice.`role`
    MODIFY deleted BIT (1) NOT NULL;

ALTER TABLE userservice.token
    ADD deleted BIT(1) NULL;

ALTER TABLE userservice.token
    MODIFY deleted BIT (1) NOT NULL;

ALTER TABLE userservice.user
    ADD deleted BIT(1) NULL;

ALTER TABLE userservice.user
    MODIFY deleted BIT (1) NOT NULL;
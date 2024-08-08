ALTER TABLE userservice.token
    ADD expiry_at datetime NOT NULL;

ALTER TABLE userservice.token
    ADD is_deleted BIT(1) NOT NULL DEFAULT false;

ALTER TABLE userservice.`role`
    ADD is_deleted BIT(1) NOT NULL DEFAULT false;

ALTER TABLE userservice.`role`
    MODIFY is_deleted BIT (1) NOT NULL DEFAULT false;

ALTER TABLE userservice.token
    MODIFY is_deleted BIT (1) NOT NULL DEFAULT false;

ALTER TABLE userservice.user
    ADD is_deleted BIT(1) NOT NULL DEFAULT false;

ALTER TABLE userservice.user
    MODIFY is_deleted BIT (1) NOT NULL DEFAULT false;

ALTER TABLE userservice.token
DROP
COLUMN expiry_date;

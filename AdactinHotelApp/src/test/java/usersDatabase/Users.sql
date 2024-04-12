CREATE TABLE Users (
    username VARCHAR(255),
    password VARCHAR(255),
    InDate DATE,
    OutDate DATE,
    FirstName VARCHAR(255),
    LastName VARCHAR(255),
    BillingAddress VARCHAR(255),
    CreditCardNumber BIGINT,
    CVV INT
);

INSERT INTO Users (username, password, InDate, OutDate, FirstName, LastName, BillingAddress, CreditCardNumber, CVV) 
VALUES 
('tokelosamson106', 'teek@ySamson106', '2024-05-01', '2024-05-10', 'Tokelo', 'Motsoeneng', '123 Main Street, NY', 1234123412341234, 324),
('tokelosamson99', 'tok@ySamson105', '2024-05-01', '2024-05-10', 'Jojo', 'Bean', '127 Main Street, NY', 1234123412341235, 321),
('tokelosamson06', 'teek@ySamson103', '2024-05-01', '2024-05-10', 'Mary', 'Jane', '129 Main Street, NY', 1234123412341236, 329);

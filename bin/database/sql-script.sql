create table product( 
    product_cod int AUTO_INCREMENT PRIMARY KEY,
    product_name VARCHAR(30),
    product_desc VARCHAR(255),
    purchase_price double(10,2),
    sale_price double(10,2),
    quantity_purchased int(10),
    sold_amount int(10),
    available_quantity int(10)
);


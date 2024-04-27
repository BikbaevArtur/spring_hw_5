create table if not exists task(
    id INT AUTO_INCREMENT PRIMARY KEY,
    description varchar (255) not null,
    taskStatus varchar(255) not null,
    localDateTime TIMESTAMP
);
CREATE TABLE Departures (
    id                  int NOT NULL AUTO_INCREMENT,
    start_of_trip       varchar NOT NULL,
    end_of_trip         varchar NOT NULL,
    date_of_start       DATE NOT NULL,
    time_of_start       TIME NOT NULL,
    train_number        varchar NOT NULL
);
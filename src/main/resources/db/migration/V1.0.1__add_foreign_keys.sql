alter table author_book add constraint FKg7j6ud9d32ll232o9mgo90s57 foreign key (author_id) references author (id);
alter table author_book add constraint FKn8665s8lv781v4eojs8jo3jao foreign key (book_id) references book (id);
alter table book add constraint FKgtvt7p649s4x80y6f4842pnfq foreign key (publisher_id) references publisher (id);

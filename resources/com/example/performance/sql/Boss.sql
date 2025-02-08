    create table if not exists movie(
        title varchar(256),
        year int,
        genre varchar(256),
        
        duration double,
        description varchar(256),
        investment decimal(10,2),
        release_date datetime(3),
        
        company_no varchar(256),
        primary key (title,year,genre)
    )ENGINE=InnoDB CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='Movie表';
    create table if not exists boss(
        id_card varchar(256),
        name varchar(256),
        age int,
        gender varchar(256),
        address varchar(256),
        phone varchar(256),
        email varchar(256),
        company_no varchar(256),
        primary key (id_card)
    )ENGINE=InnoDB CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='Boss表';
    create table if not exists company(
        no varchar(256),
        company_name varchar(256),
        company_address varchar(256),
        country varchar(256),
        registration_date datetime(3),
        paid_up_capital decimal(10,2),
        
        
        
        
        primary key (no)
    )ENGINE=InnoDB CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='Company表';
    create table if not exists actor(
        first_name varchar(256),
        last_name varchar(256),
        age int,
        gender varchar(256),
        company_no varchar(256),
        email varchar(256),
        birth_date datetime(3),
        debut_time datetime(3),
        movie_title varchar(256),
        movie_year int,
        movie_genre varchar(256),
        primary key (first_name,last_name)
    )ENGINE=InnoDB CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='Actor表';
    create table if not exists director(
        first_name varchar(256),
        last_name varchar(256),
        age int,
        gender varchar(256),
        email varchar(256),
        birth_date datetime(3),
        company_no varchar(256),
        movie_title varchar(256),
        movie_year int,
        movie_genre varchar(256),
        primary key (first_name,last_name)
    )ENGINE=InnoDB CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC COMMENT='Director表';


DROP DATABASE IF EXISTS Testing_System_Assignment_1;
CREATE DATABASE	Testing_System_Assignment_1;
USE Testing_System_Assignment_1;

DROP TABLE IF EXISTS Department;
CREATE TABLE Department(
	Department_id		TINYINT UNSIGNED PRIMARY KEY  NOT NULL AUTO_INCREMENT,
	Department_name		 NVARCHAR(200) NULL UNIQUE KEY 
    );
    
-- Table 2: Position --
DROP TABLE IF EXISTS `Position`;
CREATE TABLE `Position`(
position_id			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT ,
position_name		NVARCHAR(50) UNIQUE KEY NOT NULL
);

    
--- Table 3: Account --
DROP TABLE IF EXISTS `Account`;
CREATE TABLE `Account`(
	Account_id			TINYINT UNSIGNED PRIMARY KEY  NOT NULL AUTO_INCREMENT,	
	Email				VARCHAR(200) NOT NULL UNIQUE KEY ,
	Username			VARCHAR(200) NOT NULL UNIQUE KEY ,
	FullName			NVARCHAR(200) NOT NULL UNIQUE KEY ,
	Department_id		TINYINT UNSIGNED   NOT NULL ,
	Position_id			TINYINT UNSIGNED   NOT NULL,
	Create_date			DATETIME DEFAULT NOW(),
    FOREIGN KEY(Department_id)REFERENCES Department(Department_id),
    FOREIGN KEY(Position_id	)REFERENCES`Position`(Position_id)
    );
    
-- Table 4: Group --
DROP TABLE IF EXISTS `Group`;
CREATE TABLE `Group`(
	Group_id			TINYINT UNSIGNED PRIMARY KEY  NOT NULL AUTO_INCREMENT,
	Group_name			NVARCHAR(200) NOT NULL UNIQUE KEY ,
	Creator_id			TINYINT UNSIGNED NOT NULL UNIQUE KEY ,
	Create_date			DATETIME DEFAULT NOW(),
    FOREIGN KEY(Creator_id) REFERENCES `Account`(Account_id)
    );
    
-- Table 5:  --
DROP TABLE IF EXISTS GroupAccount;
CREATE TABLE GroupAccount(
	Group_id			TINYINT UNSIGNED  NOT NULL ,
	Account_id 			TINYINT UNSIGNED  NOT NULL   ,
	Join_date			DATETIME DEFAULT NOW(),
    PRIMARY KEY (Group_id,Account_id),
FOREIGN KEY(Group_id) REFERENCES `Group`(Group_id),
FOREIGN KEY(Account_id) REFERENCES `Account`(Account_id)
);
    
-- Table 6: Type_Question --
DROP TABLE IF EXISTS Type_Question;
CREATE TABLE Type_Question(  
	Type_id  			TINYINT UNSIGNED PRIMARY KEY  NOT NULL AUTO_INCREMENT,
	Type_name   		NVARCHAR(200) NOT NULL UNIQUE KEY  
    ); 
   
  -- Table 7: CategoryQuestion --
DROP TABLE IF EXISTS	CategoryQuestion;
CREATE TABLE CategoryQuestion(
	Category_id			TINYINT UNSIGNED PRIMARY KEY  NOT NULL AUTO_INCREMENT,
	Category_name		NVARCHAR(200) UNIQUE KEY NOT NULL
);

-- Table 8: Question --
DROP TABLE IF EXISTS	Question;
CREATE TABLE Question(
	Question_id			TINYINT UNSIGNED PRIMARY KEY  AUTO_INCREMENT,
	Content				NVARCHAR(200) NOT NULL,
	Category_id			TINYINT UNSIGNED   NOT NULL,
	Type_id				TINYINT UNSIGNED  NOT NULL,
	Creator_id			TINYINT UNSIGNED NOT NULL,
	Create_date			DATETIME DEFAULT NOW(),
FOREIGN KEY (Category_id) REFERENCES CategoryQuestion(Category_id),
FOREIGN KEY (Type_id) REFERENCES Type_Question(Type_id),
FOREIGN KEY (Creator_id) REFERENCES  `Account`(Account_id)
);

-- Table 9: Answer --
DROP TABLE IF EXISTS	Answer;
CREATE TABLE Answer(
	Answer_id			TINYINT UNSIGNED PRIMARY KEY  AUTO_INCREMENT,
	Content				NVARCHAR(200) NOT NULL,
	Question_id			TINYINT UNSIGNED NOT NULL,
	Is_correct			BIT NOT NULL, -- 0:false or 1:true
FOREIGN KEY (Question_id) REFERENCES Question(Question_id)
);

-- Table 10: Exam --
DROP TABLE IF EXISTS	Exam;
CREATE TABLE Exam(
	Exam_id				TINYINT UNSIGNED PRIMARY KEY  AUTO_INCREMENT,
	`code`				CHAR(50)  UNIQUE KEY NOT NULL,
	Title				NVARCHAR(200) NOT NULL,
	Category_id			TINYINT UNSIGNED  NOT NULL,
	Duration			TINYINT UNSIGNED  NOT NULL,
	Creator_id			TINYINT UNSIGNED  NOT NULL,
	create_date			DATETIME DEFAULT NOW(),
FOREIGN KEY (Category_id) REFERENCES  CategoryQuestion(Category_id),
FOREIGN KEY (Creator_id) REFERENCES  `Account`(Account_id)
);

-- Table 11: ExamQuestion --
DROP TABLE IF EXISTS	ExamQuestion;
CREATE TABLE ExamQuestion(
	Exam_id				TINYINT UNSIGNED NOT NULL  AUTO_INCREMENT,
	Question_id			TINYINT UNSIGNED NOT NULL,
FOREIGN KEY (Question_id) REFERENCES Question(Question_id),
FOREIGN KEY (Exam_id) REFERENCES Exam(Exam_id)  on DELETE CASCADE,
PRIMARY KEY(Exam_id,Question_id)
);






INSERT INTO Department(Department_name	)
VALUES
						(N'Marketing' ),
						(N'Sale' ),
						(N'Bảo vệ' ),
						(N'Nhân sự' ),
						(N'Kỹ thuật' ),
						(N'Tài chính' );
						
INSERT INTO Position (Position_name )
VALUES
					(N'Giám đốc'			),
					(N'Phó giám đốc'		),
					(N'Trưởng phòng'		),
					(N'Kế toán'			),
					(N'Nhân viên chính'	),
					(N'Thực tập sinh'	);
INSERT INTO `Account`		(Email, 				Username, 			Fullname, 			Department_id, 		Position_id, 	Create_date)
VALUES
							('Email1@gmail.com'	, 'UsernameA'	, 	N'Xoài Xanh'	, 		1	, 		1	,		'2018/06/03'),
                            ('Email2@gmail.com'	, 'UsernameB'	,	N'Muối Ớt'	, 			3	, 		1	,		'2017/01/03'),
                            ('Email3@gmail.com'	, 'UsernameC'	,	N'Trứng Vịt Lộn'	, 	3	, 		1	,		'2019/05/03'),
                            ('Email4@yahoo.com'	, 'UsernameD'	,	N'Bánh Tráng Nướng'	, 	2	, 		5	,		'2020/03/04'),
                            ('Email5@yahoo.com'	, 'UsernameE'	,	N'Hủ Tiếu'	, 			4	, 		6 	,		'2021/12/29');
INSERT INTO `Group`(			 Group_name,	Creator_id, 	Create_date)
VALUES
								('Group A'		, 1, 		'2018/06/03'),
								('Group B'		, 2, 		'2018/01/03'),
								('Group C'		, 3, 		'2019/05/03'),
								('Group D'		, 4, 		'2020/3/4'),
								('Group E'		, 5, 		'2021/12/29');


INSERT INTO GroupAccount(Group_id, Account_id, Join_date)
VALUES
						(1, 1, '2017/01/04'),
						(1, 4, '2018/03/04'),
						(2, 2, '2019/01/06'),
						(3, 1, '2020/01/03'),
						(3, 2, '2021/01/03');
INSERT INTO Type_Question(type_name)
VALUES
						( N'tìm giá trị'),
                        (N'tìm ẩn số'),
                        (N'tìm ý nghĩa'	),
                        (N'điền vào chỗ trống'),
                        (N'sắp xếp giá trị');
INSERT INTO CategoryQuestion( Category_name)
VALUES
						('Câu hỏi khoa hoc'	),
                        ('Câu hỏi kinh tế'		),
                        ('Câu hỏi xã hội'		),
                        ('Câu hỏi chứng khoán'	),
                        ('Câu hỏi luật pháp'		);
                        
INSERT INTO Question(Content, Category_id, Type_id, Creator_id, Create_date)
VALUES (N'Câu hỏi về Java' , 1 ,'1' , '2' ,'2020-04-05'),
(N'Câu Hỏi về PHP' , 1 ,'2' , '2' ,'2020-04-05'),
(N'Hỏi về C#' , 	3,	'3' , '3' ,'2020-04-06'),
(N'Hỏi về Ruby' , 	2 ,	'1' , '4' ,'2020-04-06'),
(N'Hỏi về Postman' , 4 ,'1' , '5' ,'2020-04-06'),
(N'Hỏi về ADO.NET' , 3 ,'2' , '3' ,'2020-04-06');

INSERT INTO Answer(Content, Question_id, Is_correct)
VALUES
 (N'Trả lời 01' , 1 , 0),
(N'Trả lời 02' , 1 , 1),
(N'Trả lời 03', 1 , 0 ),
(N'Trả lời 04', 1 , 1 ),
(N'Trả lời 05', 2 , 1 ),
(N'Trả lời 06', 3 , 1 );
INSERT INTO  Exam( `code`, Title, Category_id, Duration, Creator_id, Create_date)
VALUES 
('VTIQ001' , N'Đề thi C#' ,1 , 60 , '5' ,'2019-04-05'),
('VTIQ002' , N'Đề thi PHP' ,1 , 60 , '2' ,'2019-04-05'),
('VTIQ003' , N'Đề thi C++' , 3,120 , '2' ,'2019-04-07'),
('VTIQ004' , N'Đề thi Java' , 4 , 60, '3' ,'2021-04-08'),
('VTIQ005' , N'Đề thi Ruby' , 5 , 120, '4' ,'2022-04-10'),
('VTIQ006' , N'Đề thi Postman' , 3 ,60 , '1' ,'2021-04-05');

INSERT INTO ExamQuestion(Exam_id, Question_id)
VALUES
			(1, 3),
            (2, 1),
            (2, 2),
            (4, 1),
            (5, 5);


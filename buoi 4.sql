-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ

SELECT A.Email, A.Username , A.Fullname, D.Department_name
FROM `Account` A
JOIN Department D ON A.Department_id = D.Department_id;

-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010
SELECT *
FROM `Account`
WHERE Create_date < '2020-12-20';

-- Question 3: Viết lệnh để lấy ra tất cả các 'Giám đốc'
SELECT A.Fullname, A.Email, P.Position_name
FROM `Account` A
JOIN `Position` P ON A.Position_id= P.Position_id
WHERE P.Position_name = 'Giám đốc';

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >1 nhân viên

SELECT D.Department_name, count(Account_id) AS SL 
FROM `account` A
JOIN department D ON a.Department_id = D.Department_id
GROUP BY A.Department_id
HAVING COUNT(Account_id) >1;

-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất

SELECT E.Question_id, Q.Content ,count(E.Question_id) AS USED_NUMBER
FROM ExamQuestion E
JOIN Question Q ON Q.Question_id = E.Question_id
GROUP BY E.Question_id
HAVING count(E.Question_id) = (SELECT MAX(countQues) as maxcountQues 
								FROM (
								SELECT COUNT(E.Question_id) AS countQues FROM examquestion E
								GROUP BY E.Question_id) AS countTable);
                                
-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question

SELECT cq.Category_id, cq.Category_name, count(q.Category_id) 
FROM categoryquestion cq
JOIN question q ON cq.Category_id = q.Category_id
GROUP BY q.Category_id;
                                
  -- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam    
  
SELECT Q.Content, COUNT(EQ.Question_id) AS 'SO LUONG'
FROM Question Q
LEFT JOIN ExamQuestion EQ ON EQ.Question_id = Q.Question_id
GROUP BY Q.Question_id
ORDER BY EQ.Exam_id ASC;
                                
-- Question 8: Lấy ra Question có nhiều câu trả lời nhất

SELECT Q.Question_id, Q.Content, count(A.Question_id) 
FROM answer A
JOIN question Q ON Q.Question_id= A.Question_id
GROUP BY A.Question_id
HAVING count(A.Question_id) = (SELECT max(countQues) FROM
(SELECT count(B.Question_id) AS countQues FROM answer B
GROUP BY B.Question_id) AS countAnsw);

-- Question 9: Thống kê số lượng account trong mỗi group

SELECT G.Group_id, COUNT(GA.Account_id) AS 'SO LUONG'
FROM GroupAccount GA
JOIN `Group` G ON GA.Group_id = G.Group_id
GROUP BY G.Group_id
ORDER BY G.Group_id ASC;

-- Question 10: Tìm chức vụ có ít người nhất

SELECT P.Position_id, P.Position_name, count( A.Position_id) AS SL 
FROM `account` A
JOIN position P ON A.Position_id = P.Position_id
GROUP BY A.Position_id
HAVING count(A.Position_id)= (
SELECT MIN(minP) FROM(
SELECT count(B.Position_id) AS minP FROM `account` B
GROUP BY B.Position_id) AS minPA);

-- Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
SELECT d.Department_id,d.Department_name, p.Position_name, count(p.Position_name) 
FROM `account` a
JOIN department d ON a.Department_id = d.Department_id
JOIN position p ON a.Position_id= p.Position_id
GROUP BY d.Department_id, p.Position_id;


-- Question 14:Lấy ra group không có account nào

SELECT G.Group_id,G.Group_name
FROM GroupAccount GA
RIGHT JOIN `Group`G ON GA.Group_id=G.Group_id
WHERE GA.Group_id is NULL;

-- Question 15:Lấy ra account không có group nào
SELECT A.Account_id
FROM GroupAccount GA
RIGHT JOIN `Account`A ON  A.Account_id=GA.Account_id
WHERE GA.Group_id is NULL;


-- Question 17:
-- a) Lấy các account thuộc nhóm thứ 1
-- b) Lấy các account thuộc nhóm thứ 2
-- c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau

SELECT A.Fullname
FROM `Account` A
JOIN GroupAccount GA ON A.Account_id = GA.Account_id
WHERE GA.Group_id = 1
UNION
SELECT A.FullName
FROM `Account` 
JOIN GroupAccount GA ON A.Account_id = GA.Account_id
WHERE GA.Group_id = 2;

-- Question 18:
-- a) Lấy các group có lớn hơn 5 thành viên
-- b) Lấy các group có nhỏ hơn 7 thành viên
-- c) Ghép 2 kết quả từ câu a) và câu b)

SELECT g.Group_name, COUNT(ga.Group_id) AS SL
FROM GroupAccount ga
JOIN `Group` g ON ga.Group_id = g.Group_id
GROUP BY g.Group_id
HAVING COUNT(ga.Group_id) >= 5
UNION
SELECT g.Group_name, COUNT(ga.Group_id) AS SL
FROM GroupAccount ga
JOIN `Group` g ON ga.Group_id = g.Group_id
GROUP BY g.Group_id
HAVING COUNT(ga.Group_id) <= 7;

-- Question 8: Lấy ra Question có nhiều câu trả lời nhất
SELECT a1.Question_id,q.Content,COUNT(a1.Question_id)as Soluong 
FROM  Answer a1
join  Question q on q.Question_id = a1.Question_id
GROUP BY  a1.Question_id
HAVING COUNT(a1.Question_id) = (SELECT MAX(SoLanSUDung) FROM (SELECT count(a.Question_id) as SoLanSUDung FROM Answer a
group by  a.Question_id) AS COUNTMAX);

-- Question 10: Tìm chức vụ có ít người nhất

SELECT a1.Position_id,p.Position_name,COUNT(a1.Position_id)as Soluong 
FROM  `Account` a1
join  Position p on p.Position_id = a1.Position_id
GROUP BY  a1.Position_id
HAVING COUNT(a1.Position_id) = (SELECT MIN(songuoi) FROM (SELECT count(a.Position_id) as songuoi FROM `Account` a
group by  a.Position_id) AS COUNTMIN);


-- Question 14:Lấy ra group không có account nào

SELECT	G.Group_name,G.Group_id
FROM	`Group`G
LEFT JOIN GroupAccount GA	ON GA.Group_id=G.Group_id
WHERE GA.Group_id IS NULL;


-- Question 14:Lấy ra group không có account nào

SELECT	G.Group_name,G.Group_id
FROM	`Group`G
LEFT JOIN GroupAccount GA	ON GA.Group_id=G.Group_id
WHERE GA.Group_id IS NULL;



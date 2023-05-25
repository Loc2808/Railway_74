USE testing_1;

-- question 2 : lấy tất cả các phòng ban --
SELECT * FROM testing_1.department
ORDER BY Department_id ASC;

-- question 3: lấy ra id của phòng ban sale --
SELECT Department_id FROM testing_1.department
WHERE Department_name = 'Sale';

-- question 4: lấy ra thông tin account có full name dài nhất --
SELECT * FROM testing_1.account
WHERE char_length(FullName) = (
SELECT MAX(char_length(FullName)) FROM testing_1.account
);

-- question 5: lấy ra thông tin account có full name dài nhất và thuộc phòng ban id = 3 --
SELECT * FROM testing_1.account
WHERE char_length(FullName) = (
	SELECT MAX(char_length(FullName)) FROM testing_1.account
	WHERE Department_id = 3)
AND Department_id = 3;

-- question 6: lấy ra tên group đã tham gia trước ngày 20/12/2019 --
SELECT Group_name FROM testing_1.group
WHERE Create_date < DATE('2019/12/20');

-- question 7: lấy ra id của question có >= 2 câu trả lời --
SELECT Question_id, COUNT(Answer_id) AS AL
FROM testing_1.answer
GROUP BY Question_id
HAVING COUNT(Answer_id) >= 2;

-- question 8: lấy ra mã đề thi có thời gian thi > 60 phúT và được tạo trước ngày 20/12/2019 --
SELECT code FROM testing_1.exam
WHERE Duration > 60 AND create_date < DATE('2019/12/20');

-- question 9: lấy ra 5 group được tạo gần đây nhất --
SELECT * FROM testing_1.group
ORDER BY Create_date DESC
LIMIT 5;

-- question 10: đếm số nhân viên thuộc phòng ban có id = 4 --
SELECT COUNT(Account_id) AS Number_employee
FROM testing_1.account
WHERE Department_id = 4;

-- question 11: lấy ra nhân viên có tên bắt đầu bằng chữ K và kết thúc bằng O --
SELECT * FROM testing_1.account
WHERE FullName LIKE 'K%O';

-- question 12: UPDATE thông tin của account có id =5 thành tên nguyen ba loc và email loc.nguyenba@gmail.com -- 
UPDATE testing_1.account
SET FullName = 'nguyen ba loc', Email = 'loc.nguyenba@gmail.com'
WHERE Account_id = 5;





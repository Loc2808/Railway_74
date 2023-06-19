package java_assignment_1;

import java.util.Date;

public class In_Object {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		// Create Department
		Department De1 = new Department();
		De1.DepartmentID = 1;
		De1.DepartmentName = "Sale";
		
		Department De2 = new Department();
		De2.DepartmentID = 2;
		De2.DepartmentName = "CEO";
		
		Department De3 = new Department();
		De3.DepartmentID = 3;
		De3.DepartmentName = "CFO";
		
		System.out.println("Department_Name: " + De1.DepartmentName);
		System.out.println("Department_ID: " + De1.DepartmentID);
		
		System.out.println("------");
		
		// Create Account
		Account Ac1 = new Account();
		Ac1.AccountID = 1;
		Ac1.CreateDate = new Date("2021/08/11");
		Ac1.DepartmentID = 2;
		Ac1.Email = "account_1@gmail.com";
		Ac1.FullName = "Account1";
		Ac1.PositionID = 1;
		Ac1.UserName = "Ac_1";
		
		Account Ac2 = new Account();
		Ac2.AccountID = 2;
		Ac2.CreateDate = new Date("2023/01/21");
		Ac2.DepartmentID = 1;
		Ac2.Email = "account_2@gmail.com";
		Ac2.FullName = "Account2";
		Ac2.PositionID = 3;
		Ac2.UserName = "Ac_2";
		
		Account Ac3 = new Account();
		Ac3.AccountID = 3;
		Ac3.CreateDate = new Date("2022/07/15");
		Ac3.DepartmentID = 1;
		Ac3.Email = "account_3@gmail.com";
		Ac3.FullName = "Account3";
		Ac3.PositionID = 2;
		Ac3.UserName = "Ac_3";
		
		
		System.out.println("Account_ID: " + Ac3.AccountID);
		System.out.println("CreateDate: " + Ac3.CreateDate);
		System.out.println("Department_ID: " + Ac3.DepartmentID);
		System.out.println("Email: " + Ac3.Email);
		System.out.println("Full_Name: " + Ac3.FullName);
		System.out.println("Position_ID: " + Ac3.PositionID);
		System.out.println("UserName: " + Ac3.UserName);
		
		System.out.println("------");
		
		// Create Group
		Group Gr1 = new Group();
		Gr1.CreateDay = new Date("2021/05/22");
		Gr1.CreatorID = 2;
		Gr1.GroupID = 1;
		Gr1.GroupName = "Group_1";
		
		Group Gr2 = new Group();
		Gr2.CreateDay = new Date("2020/10/06");
		Gr2.CreatorID = 2;
		Gr2.GroupID = 2;
		Gr2.GroupName = "Group_2";
		
		Group Gr3 = new Group();
		Gr3.CreateDay = new Date("2022/05/18");
		Gr3.CreatorID = 1;
		Gr3.GroupID = 3;
		Gr3.GroupName = "Group_3";
		
		
		// Create Answer
		Answer An1 = new Answer();
		An1.AnswerID = 1;
		An1.Content = "Answer_1";
		An1.isCorrect = true;
		An1.QuestionID = 2;
		
		Answer An2 = new Answer();
		An2.AnswerID = 2;
		An2.Content = "Answer_2";
		An2.isCorrect = true;
		An2.QuestionID = 1;
		
		Answer An3 = new Answer();
		An3.AnswerID = 3;
		An3.Content = "Answer_3";
		An3.isCorrect = false;
		An3.QuestionID = 1;
		
		
		// Create Question
		Question Q1 = new Question();
		Q1.CategoryID = 1;
		Q1.Content = "Question_1";
		Q1.CreateDate = new Date("2020/02/13");
		Q1.CreatorID = 2;
		Q1.TypeID = 2;
		Q1.QuestionID = 1;
		
		Question Q2 = new Question();
		Q2.CategoryID = 3;
		Q2.Content = "Question_2";
		Q2.CreateDate = new Date("2021/02/17");
		Q2.CreatorID = 3;
		Q2.TypeID = 2;
		Q2.QuestionID = 2;
		
		Question Q3 = new Question();
		Q3.CategoryID = 2;
		Q3.Content = "Question_3";
		Q3.CreateDate = new Date("2023/06/06");
		Q3.CreatorID = 1;
		Q3.TypeID = 1;
		Q3.QuestionID = 3;
		
		
		// Create Position
		Position P1 = new Position();
		P1.PositionID = 1;
		P1.PositionName = "Manarger";
		
		Position P2 = new Position();
		P2.PositionID = 2;
		P2.PositionName = "assistant";
		
		Position P3 = new Position();
		P3.PositionID = 1;
		P3.PositionName = "technique";
		
		
		
		// Create Exam
		Exam E1 = new Exam();
		E1.CategoryID = 3;
		E1.Code = "Code_1";
		E1.CreateDate = new Date("2022/12/01");
		E1.CreatorID = 3;
		E1.Duration = 60;
		E1.ExamID = 1;
		E1.Title = "Title_1";
		
		Exam E2 = new Exam();
		E2.CategoryID = 3;
		E2.Code = "Code_2";
		E2.CreateDate = new Date("2021/09/03");
		E2.CreatorID = 1;
		E2.Duration = 120;
		E2.ExamID = 2;
		E2.Title = "Title_2";
		
		Exam E3 = new Exam();
		E3.CategoryID = 2;
		E3.Code = "Code_3";
		E3.CreateDate = new Date("2022/08/25");
		E3.CreatorID = 1;
		E3.Duration = 60;
		E3.ExamID = 3;
		E3.Title = "Title_3";
		
		// Create TypeQuestion
		TypeQuestion TQ1 = new TypeQuestion();
		TQ1.TypeID = 1;
		TQ1.TypeName = TypeName.Essay;
		
		
		TypeQuestion TQ2 = new TypeQuestion();
		TQ2.TypeID = 2;
		TQ2.TypeName = TypeName.Multipe_Choice;
		
		TypeQuestion TQ3 = new TypeQuestion();
		TQ3.TypeID = 3;
		TQ3.TypeName = TypeName.Multipe_Choice;
		
		
		System.out.println("Type_ID: " + TQ2.TypeID);
		System.out.println("Type_Name: " + TQ2.TypeName);
		
		System.out.println("------");
		
		// Create CategoryQuestion
		CategoryQuestion CQ1 = new CategoryQuestion();
		CQ1.CategoryID = 1;
		CQ1.CategoryName = "Java";
		
		CategoryQuestion CQ2 = new CategoryQuestion();
		CQ2.CategoryID = 2;
		CQ2.CategoryName = "SQL";
		
		CategoryQuestion CQ3 = new CategoryQuestion();
		CQ3.CategoryID = 3;
		CQ3.CategoryName = "Ruby";
		
		
		// Create ExamQuestion
		ExamQuestion EQ1 = new ExamQuestion();
		EQ1.ExamID = 1;
		EQ1.QuestionID = 2;
		
		ExamQuestion EQ2 = new ExamQuestion();
		EQ2.ExamID = 2;
		EQ2.QuestionID = 3;
		
		ExamQuestion EQ3 = new ExamQuestion();
		EQ3.ExamID = 3;
		EQ3.QuestionID = 1;
		
		
		// Create GroupAccount
		GroupAccount GA1 = new GroupAccount();
		GA1.AccountID = 1;
		GA1.GroupID = 3;
		GA1.JoinDate = new Date("2021/02/01");
		
		
		GroupAccount GA2 = new GroupAccount();
		GA2.AccountID = 2;
		GA2.GroupID = 1;
		GA2.JoinDate = new Date("2022/11/06");
		
		GroupAccount GA3 = new GroupAccount();
		GA3.AccountID = 3;
		GA3.GroupID = 2;
		GA3.JoinDate = new Date("2020/04/14");
		
	}
}

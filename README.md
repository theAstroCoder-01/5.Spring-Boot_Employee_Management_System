# 5.Spring-Boot_Employee_Management_System

<!DOCTYPE html>
<html>

<body>

<h1>Spring-Boot_Employee_Management_System</h1>

<p><strong>Employee Management System</strong> is a REST API with CRUD operations that allows the user to Create, Read, Update, and Delete any kind of employee. This API has an ADD EMPLOYEE function
to save a new employee in MySQL database to be shown in the List of Employees.
  
<h2>Index</h2>

<ol>
   <li><a href="#classes">Classes</a>
        <ul>
            <li><a href="#employeemanagementsystemapplication">EmployeeManagementSystemApplication</a></li>
            <li><a href="#employee">Employee</a></li>
            <li><a href="#employeecontroller">EmployeeController</a></li>
            <li><a href="#employeerepository">EmployeeRepository</a></li>
            <li><a href="#employeeservice">EmployeeService</a></li>
            <li><a href="#employeeserviceimpl">EmployeeServiceImpl</a></li>
        </ul>
    </li>
</ol>

<h2 id="classes">Classes</h2>

<h3 id="employeemanagementsystemapplication">AppLauncher</h3>
<p>The <code>EmployeeManagementSystemApplication</code> class contains the main method that runs the Spring Boot application.</p>

<h3 id="employee">Employee</h3>
<p>The <code>Employee</code> class stores the data that maps to database tables. In this case the <code>Employee</code> class corresponds to a table in MySQL, and its fields (id, firstName, lastName, email) correspond to the columns in that table. </p>

<h3 id="employeecontroller">EmployeeController</h3>
<p>The <code>employeecontroller</code>class will handles HTTP requests which define the endpoints of the API. Also, it uses service classes to perform business logic.

<h3 id="employeerepository">EmployeeRepository</h3>
<p>The <code>employeerepository</code> interface extends JpaRepository and provides methods for CRUD operations inside the API REST.  
  
<h3 id="employeeservice(+Impl)">EmployeeService(+Impl)</h3>
<p>The <code>employeeservice</code> class interacts directly with the <code>EmployeeRepository</code>. In here we can define methods to handle the CRUD operations related to entities defined in the <code>Employee</code> class.</p>

</body>

</html>


![101](https://github.com/user-attachments/assets/7ecad9ff-8ab0-476e-b443-8daf728774c5)

![102](https://github.com/user-attachments/assets/7e856e95-ec7c-4caf-a35f-a25ca058d9e5)


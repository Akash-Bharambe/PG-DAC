namespace LabExam.Utility
{
    using System.Data.SqlClient;
    using Microsoft.Extensions.Configuration;
    using System.Collections.Generic;
    using LabExam.Models;

    public class Utils
    {
        private readonly string? _connectionString;

        public Utils(IConfiguration configuration)
        {
            _connectionString = configuration.GetConnectionString("EmployeeDBContext");
        }

        public List<Employee> GetAllEmployees()
        {
            List<Employee> employees = new List<Employee>();

            using (SqlConnection con = new SqlConnection(_connectionString))
            {
                SqlCommand cmd = new SqlCommand("SELECT * FROM Employees", con);
                con.Open();
                SqlDataReader rdr = cmd.ExecuteReader();

                while (rdr.Read())
                {
                    Employee employee = new Employee
                    {
                        Id = Convert.ToInt32(rdr["Id"]),
                        Name = rdr["Name"].ToString(),
                        City = rdr["City"].ToString(),
                        Address = rdr["Address"].ToString()
                    };
                    employees.Add(employee);
                }
            }
            return employees;
        }

        public Employee GetEmployeeById(int id)
        {
            Employee employee = new Employee();

            using (SqlConnection con = new SqlConnection(_connectionString))
            {
                SqlCommand cmd = new SqlCommand("SELECT * FROM Employees WHERE Id=@Id", con);
                cmd.Parameters.AddWithValue("@Id", id);
                con.Open();
                SqlDataReader rdr = cmd.ExecuteReader();

                if (rdr.Read())
                {
                    employee.Id = Convert.ToInt32(rdr["Id"]);
                    employee.Name = rdr["Name"].ToString();
                    employee.City = rdr["City"].ToString();
                    employee.Address = rdr["Address"].ToString();
                }
            }
            return employee;
        }

        public void UpdateEmployee(Employee employee)
        {
            using (SqlConnection con = new SqlConnection(_connectionString))
            {
                SqlCommand cmd = new SqlCommand("UPDATE Employees SET Name=@Name, City=@City, Address=@Address WHERE Id=@Id", con);
                cmd.Parameters.AddWithValue("@Id", employee.Id);
                cmd.Parameters.AddWithValue("@Name", employee.Name);
                cmd.Parameters.AddWithValue("@City", employee.City);
                cmd.Parameters.AddWithValue("@Address", employee.Address);
                con.Open();
                cmd.ExecuteNonQuery();
            }
        }

        public void AddEmployee(Employee employee)
        {
            using (SqlConnection con = new SqlConnection(_connectionString))
            {
                SqlCommand cmd = new SqlCommand("INSERT INTO Employees (Name, City, Address) VALUES (@Name, @City, @Address)", con);
                cmd.Parameters.AddWithValue("@Name", employee.Name);
                cmd.Parameters.AddWithValue("@City", employee.City);
                cmd.Parameters.AddWithValue("@Address", employee.Address);
                con.Open();
                cmd.ExecuteNonQuery();
            }
        }
    }

}

using LabExam.Models;
using System.Data.SqlClient;

namespace _240340120063.Controllers
{
    public class Utils
    {

        private SqlConnection GetOpenConnection()
        {
            var connection = new SqlConnection("Data Source=(localdb)\\MsSqlLocalDb;Initial Catalog=EmployeeDB;Integrated Security=true;MultipleActiveResultSets=true");
            connection.Open();
            return connection;
        }

        public List<Student> GetAllEmployees()
        {
            List<Student> employees = new List<Student>();

            try
            {
                using (var con = GetOpenConnection())
                {
                    SqlCommand cmd = new SqlCommand("SELECT * FROM Employees", con);
                    SqlDataReader rdr = cmd.ExecuteReader();

                    while (rdr.Read())
                    {
                        Student employee = new Student
                        {
                            Id = Convert.ToInt32(rdr["Id"]),
                            Name = rdr["Name"].ToString(),
                            City = rdr["City"].ToString(),
                            Address = rdr["Address"].ToString()
                        };
                        employees.Add(employee);
                    }
                }
            }
            catch (SqlException ex)
            {
                Console.WriteLine(ex.Message);
            }

            return employees;
        }

        public Student GetEmployeeById(int id)
        {
            Student employee = new Student();

            try
            {
                using (var con = GetOpenConnection())
                {
                    SqlCommand cmd = new SqlCommand("SELECT * FROM Employees WHERE Id=@Id", con);
                    cmd.Parameters.AddWithValue("@Id", id);
                    SqlDataReader rdr = cmd.ExecuteReader();

                    if (rdr.Read())
                    {
                        employee.Id = Convert.ToInt32(rdr["Id"]);
                        employee.Name = rdr["Name"].ToString();
                        employee.City = rdr["City"].ToString();
                        employee.Address = rdr["Address"].ToString();
                    }
                }
            }
            catch (SqlException ex)
            {
                Console.WriteLine(ex.Message);
            }

            return employee;
        }

        public void UpdateEmployee(Student employee)
        {
            try
            {
                using (var con = GetOpenConnection())
                {
                    SqlCommand cmd = new SqlCommand("UPDATE Employees SET Name=@Name, City=@City, Address=@Address WHERE Id=@Id", con);
                    cmd.Parameters.AddWithValue("@Id", employee.Id);
                    cmd.Parameters.AddWithValue("@Name", employee.Name);
                    cmd.Parameters.AddWithValue("@City", employee.City);
                    cmd.Parameters.AddWithValue("@Address", employee.Address);
                    cmd.ExecuteNonQuery();
                }
            }
            catch (SqlException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public void AddEmployee(Student employee)
        {
            try
            {
                using (var con = GetOpenConnection())
                {
                    SqlCommand cmd = new SqlCommand("INSERT INTO Employees (Name, City, Address) VALUES (@Name, @City, @Address)", con);
                    cmd.Parameters.AddWithValue("@Name", employee.Name);
                    cmd.Parameters.AddWithValue("@City", employee.City);
                    cmd.Parameters.AddWithValue("@Address", employee.Address);
                    cmd.ExecuteNonQuery();
                }
            }
            catch (SqlException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }

}

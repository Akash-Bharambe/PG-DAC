
using Microsoft.Data.SqlClient;
using System.Data;

namespace WebApplication1.Models
{
    public class Employee
    {
        public int EmpNo { get; set; }
        public string? Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }

        public Employee() { }

        public Employee(int id, string? name = "Default", decimal basicSalary = 50000, int deptNo = 100)
        {
            EmpNo = id;
            Name = name;
            Basic = basicSalary;
            DeptNo = deptNo;
        }

        internal static async Task<SqlConnection> GetConnection()
        {
            SqlConnection sqlConnection = new()
            {
                ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = ActsJuly2024; Integrated Security = True;"
            };
            sqlConnection.Open();
            return await Task.Run(() => sqlConnection);
        }

        internal static async Task<List<Employee>> GetAllEmployees()
        {
            SqlConnection sqlConnection = await GetConnection();
            SqlCommand sqlCommand = new()
            {
                Connection = sqlConnection,
                CommandType = CommandType.Text,
                CommandText = "select * from Employees"
            };

            SqlDataReader sqlDataReader = sqlCommand.ExecuteReader(CommandBehavior.CloseConnection);
            List<Employee> list = [];
            while (sqlDataReader.Read())
            {
                Employee employee = new(sqlDataReader.GetInt32("EmpNo"), sqlDataReader.GetString("Name"), sqlDataReader.GetDecimal("Basic"), sqlDataReader.GetInt32("DeptNo"));
                list.Add(employee);
            }
            sqlDataReader.Close();
            return list;
        }

        internal static async Task<Employee?> GetSingleEmployee(int id)
        {
            SqlConnection connection = await GetConnection();
            Employee? employee = null;
            SqlCommand sqlCommand = new()
            {
                Connection = connection,
                CommandType = CommandType.Text,
                CommandText = "select * from Employees where EmpNo = @EmpNo"
            };

            sqlCommand.Parameters.AddWithValue("@EmpNo", id);
            SqlDataReader sqlDataReader = sqlCommand.ExecuteReader(CommandBehavior.CloseConnection);
            if (sqlDataReader.Read())
            {
                employee = new(sqlDataReader.GetInt32("EmpNo"), sqlDataReader.GetString("Name"), sqlDataReader.GetDecimal("Basic"), sqlDataReader.GetInt32("DeptNo"));
            }
            sqlDataReader.Close();
            return employee;
        }

        internal static async Task Insert(Employee emp)
        {
            SqlConnection sqlConnection = await GetConnection();
            SqlCommand sqlCommand = new()
            {
                Connection = sqlConnection,
                CommandType = CommandType.Text,
                CommandText = "insert into Employees values(@EmpNo ,@Name, @Basic, @DeptNo)"
            };
            sqlCommand.Parameters.AddWithValue("@EmpNo", emp.EmpNo);
            sqlCommand.Parameters.AddWithValue("@Name", emp.Name);
            sqlCommand.Parameters.AddWithValue("@Basic", emp.Basic);
            sqlCommand.Parameters.AddWithValue("@DeptNo", emp.DeptNo);
            sqlCommand.ExecuteNonQuery();
            sqlConnection.Close();
        }

        internal static async Task Update(int id, Employee employee)
        {
            SqlConnection connection = await GetConnection();
            SqlCommand sqlCommand = new()
            {
                Connection = connection,
                CommandType = CommandType.Text,
                CommandText = "update Employees set  Name = @Name, Basic = @Basic, DeptNo = @DeptNo where EmpNo = @EmpNo"
            };
            sqlCommand.Parameters.AddWithValue("@EmpNo", id);
            sqlCommand.Parameters.AddWithValue("@Name", employee.Name);
            sqlCommand.Parameters.AddWithValue("@Basic", employee.Basic);
            sqlCommand.Parameters.AddWithValue("@DeptNo", employee.DeptNo);
            sqlCommand.ExecuteNonQuery();
            connection.Close();
        }

        internal static async Task Delete(int id)
        {
            SqlConnection sqlConnection = await GetConnection();
            SqlCommand sqlCommand = new()
            {
                Connection = sqlConnection,
                CommandType = CommandType.Text,
                CommandText = "delete from Employees where EmpNo = @EmpNo"
            };
            sqlCommand.Parameters.AddWithValue("@EmpNo", id);
            sqlCommand.ExecuteNonQuery();
            sqlConnection.Close();
        }
    }
}

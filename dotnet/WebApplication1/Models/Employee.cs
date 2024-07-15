namespace WebApplication1.Models
{
    public class Employee
    {
        public int EmpNo { get; set; }
        public string? Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }

        public Employee()
        {
            
        }

        public Employee(int id, string? name = "Default", decimal basicSalary = 50000, int deptNo = 100)
        {
            EmpNo = id;
            Name = name;
            Basic = basicSalary;
            DeptNo = deptNo;
        }
    }
}

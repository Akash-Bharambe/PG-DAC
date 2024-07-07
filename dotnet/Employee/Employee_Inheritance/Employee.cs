using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Employee_Inheritance
{
    internal abstract class Employee : IDbFunctions
    {

        private static int count = 0;
        private string? name;
        private short deptNo;

        public int EmployeeNo { get; }

        public string? Name
        {
            set
            {
                if (!string.IsNullOrWhiteSpace(value)) name = value;
            }
            get => name;
        }


        public short DeptNo
        {
            set
            {
                if (short.IsPositive(value)) deptNo = value;
            }
            get => deptNo;
        }

        public abstract decimal BasicSalary { set; get; }

        public abstract decimal CalcNetSalary();
        public abstract void Save();
        public abstract void Update();
        public abstract void Delete();

        public Employee(string? name, short deptNo)
        {
            EmployeeNo = ++count;
            Name = name;
            DeptNo = deptNo;
        }
        public override string ToString()
        {
            return $"{EmployeeNo} . {name} | DeptNo: {DeptNo}";
        }
    }
}

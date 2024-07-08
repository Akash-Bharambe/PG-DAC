using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Employee_Inheritance
{
    internal abstract class Employee : IDbFunctions
    {

        protected static int s_count = 0;
        private string? _name;
        private short _deptNo;

        public int EmployeeNo { get; }

        public string? Name
        {
            set
            {
                if (!string.IsNullOrWhiteSpace(value)) _name = value;
            }
            get => _name;
        }

        /// <summary>
        /// 
        /// </summary>
        public short DeptNo
        {
            set
            {
                if (short.IsPositive(value)) _deptNo = value;
            }
            get => _deptNo;
        }

        public abstract decimal BasicSalary { set; get; }

        public abstract decimal CalcNetSalary();
        public abstract void Save();
        public abstract void Update();
        public abstract void Delete();

        public Employee(string? name, short deptNo)
        {
            EmployeeNo = ++s_count;
            Name = name;
            DeptNo = deptNo;
        }
        public override string ToString()
        {
            return $"{EmployeeNo} . {_name} | DeptNo: {DeptNo}";
        }
    }
}

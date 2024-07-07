using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Employee_Inheritance
{
    internal class Manager : Employee
    {
        public override decimal BasicSalary { get; set; }

        private string? designation;
        public string? Designation
        {
            set
            {
                if (!string.IsNullOrWhiteSpace(value)) designation = value;
            }
            get => designation;
        }

        public override decimal CalcNetSalary()
        {
            return BasicSalary * (1 + 0.25m);
        }

        public override void Save()
        {
            throw new NotImplementedException();
        }

        public override void Update()
        {
            throw new NotImplementedException();
        }

        public override void Delete()
        {
            throw new NotImplementedException();
        }

        public Manager(string? name, short deptNo, decimal BasicSalary, string? designation) : base(name, deptNo)
        {
            this.BasicSalary = BasicSalary;
            Designation = designation;
        }

        public override string ToString()
        {
            return $"{base.ToString()} | Salary : {CalcNetSalary()} | Designation: {Designation} ";
        }

    }
}

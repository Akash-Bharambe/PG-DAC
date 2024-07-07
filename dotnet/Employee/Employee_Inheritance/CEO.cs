using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Employee_Inheritance
{
    internal class CEO : Employee
    {
        public override decimal BasicSalary { get; set; }

        public sealed override decimal CalcNetSalary()
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

        public CEO(string? name, short deptNo, decimal BasicSalary) : base(name, deptNo)
        {
            this.BasicSalary = BasicSalary;
        }

        public override string ToString()
        {
            return $"{base.ToString()} | Salary : {CalcNetSalary()}";
        }

    }
}

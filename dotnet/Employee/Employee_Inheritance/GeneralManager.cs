using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Employee_Inheritance
{
    internal class GeneralManager : Manager
    {
        public string? Perks { get; set; }

        public GeneralManager(string? name, short deptNo, decimal basicSalary, string? designation, string? Perks) : base(name, deptNo, basicSalary, designation)
        {
            this.Perks = Perks;
        }

        /// <summary>
        /// Calculate Net Salary of a General Manager
        /// </summary>
        /// <returns> net salary of general manager </returns>
        public override decimal CalcNetSalary()
        {
            return BasicSalary * 0.9M;
        }


        public override string ToString()
        {
            return $"{base.ToString()} | Perks : {Perks}";
        }

    }
}

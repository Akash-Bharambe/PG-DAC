using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Employee_Inheritance
{
    internal interface IDbFunctions
    {
        void Save();
        void Update();
        void Delete();
    }
}

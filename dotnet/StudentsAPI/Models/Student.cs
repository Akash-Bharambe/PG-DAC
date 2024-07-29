using System;
using System.Collections.Generic;

namespace StudentsAPI.Models;

public partial class Student
{
    public int No { get; set; }

    public string Name { get; set; } = null!;

    public string Address { get; set; } = null!;
}

using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using WebApplication1.Models;

namespace WebApplication1.Controllers
{
    public class EmployeesController : Controller
    {
        // GET: EmployeesController
        // https://localhost:1234/Employees/Index
        public ActionResult Index()
        {
            IEnumerable<Employee> employees = new List<Employee>
            {
                new Employee(1, "Akash", 98765m, 10),
                new Employee(2, "Shreyas", 98735m, 20),
                new Employee(3, "Sakshi", 58765m, 30),
                new Employee(4, "Ravi", 65780m, 40),
                new Employee(5, "Aditi", 75890m, 50),
                new Employee(6, "Neha", 80900m, 60),
                new Employee(7, "Rohan", 65230m, 70),
                new Employee(8, "Vikas", 76250m, 80),
                new Employee(9, "Anita", 87450m, 90),
                new Employee(10, "Pooja", 94560m, 100),
                new Employee(11, "Arjun", 51230m, 110),
                new Employee(12, "Maya", 67450m, 120),
                new Employee(13, "Karan", 71230m, 130)
            };

            return View(employees);
        }

        // GET: EmployeesController/Details/5
        // https://localhost:1234/Employees/Details/1
        public ActionResult Details(int id = 1)
        {
            Employee employee = new()
            {
                EmpNo = id,
                Name = "Akash",
                Basic = 76575,
                DeptNo = 10
            };
            return View(employee);
        }

        // GET: EmployeesController/Create
        // https://localhost:1234/Employees/Create
        [HttpGet]
        public ActionResult Create()
        {
            return View();
        }

        // POST: EmployeesController/Create
        // https://localhost:1234/Employees/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        // public ActionResult Create(IFormCollection collection)
        // public ActionResult Create(int EmpNo, string Name, decimal Basic, int DeptNo) // Binding
        public ActionResult Create(Employee emp, IFormCollection collection) // Model Binding
        {
            try
            {
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: EmployeesController/Edit/5
        // https://localhost:1234/Employees/Edit/1
        public ActionResult Edit(int id = 1)
        {
            Employee employee = new()
            {
                EmpNo = id,
                Name = "Akash",
                Basic = 76575,
                DeptNo = 10
            };
            return View(employee);
        }

        // POST: EmployeesController/Edit/5
        // https://localhost:1234/Employees/Edit/1
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(int id,Employee employee, IFormCollection collection)
        {
            try
            {

                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: EmployeesController/Delete/5
        public ActionResult Delete(int id=1)
        {
            Employee employee = new()
            {
                EmpNo = id,
                Name = "Akash",
                Basic = 76575,
                DeptNo = 10
            };
            return View(employee);
        }

        // POST: EmployeesController/Delete/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Delete(IFormCollection collection, int id = 1)
        {
            try
            {
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }
    }
}

using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using WebApplication1.Models;

namespace WebApplication1.Controllers
{
    public class EmployeesController : Controller
    {
        // GET: EmployeesController
        // https://localhost:1234/Employees/Index
        public async Task<ActionResult> Index()
        {
            IEnumerable<Employee> employees = await Employee.GetAllEmployees();

            return View(employees);
        }

        // GET: EmployeesController/Details/5
        // https://localhost:1234/Employees/Details/1
        public async Task<ActionResult> Details(int id)
        {
            Employee? employee = await Employee.GetSingleEmployee(id);
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
        public async Task<ActionResult> Create(Employee emp, IFormCollection collection) // Model Binding
        {
            try
            {
                await Employee.Insert(emp);
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: EmployeesController/Edit/5
        // https://localhost:1234/Employees/Edit/1
        public async Task<ActionResult> Edit(int id)
        {
            Employee? employee = await Employee.GetSingleEmployee(id);
            return View(employee);
        }

        // POST: EmployeesController/Edit/5
        // https://localhost:1234/Employees/Edit/1
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async  Task<ActionResult> Edit(int id,Employee employee, IFormCollection collection)
        {
            try
            {
                await Employee.Update(id, employee);
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: EmployeesController/Delete/5
        public async Task<ActionResult> Delete(int id)
        {
            Employee? employee = await Employee.GetSingleEmployee(id);
            return View(employee);
        }

        // POST: EmployeesController/Delete/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<ActionResult> Delete(IFormCollection collection, int id)
        {
            try
            {
                await Employee.Delete(id);
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }
    }
}

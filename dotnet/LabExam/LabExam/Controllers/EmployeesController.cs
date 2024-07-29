using LabExam.Models;
using LabExam.Utility;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace LabExam.Controllers
{

    public class EmployeesController : Controller
    {
        private readonly Utils _dataAccess;

        public EmployeesController(Utils dataAccess)
        {
            _dataAccess = dataAccess;
        }

        public IActionResult Index()
        {
            List<Employee> employees = _dataAccess.GetAllEmployees();
            return View(employees);
        }

        public IActionResult Edit(int id)
        {
            Employee employee = _dataAccess.GetEmployeeById(id);
            return View(employee);
        }

        [HttpPost]
        public IActionResult Edit(Employee employee)
        {
            if (ModelState.IsValid)
            {
                _dataAccess.UpdateEmployee(employee);
                return RedirectToAction("Index");
            }
            return View(employee);
        }

        public IActionResult Create()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Create(Employee employee)
        {
            if (ModelState.IsValid)
            {
                _dataAccess.AddEmployee(employee);
                return RedirectToAction("Index");
            }
            return View(employee);
        }
    }


}

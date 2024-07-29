using _240340120063.Controllers;
using LabExam.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace LabExam.Controllers
{

    public class StudentsController : Controller
    {
        private readonly Utils _dataAccess;

        public StudentsController(Utils dataAccess)
        {
            _dataAccess = dataAccess;
        }

        public IActionResult Index()
        {
            List<Student> employees = _dataAccess.GetAllEmployees();
            return View(employees);
        }

        public IActionResult Edit(int id)
        {
            Student employee = _dataAccess.GetEmployeeById(id);
            return View(employee);
        }

        [HttpPost]
        public IActionResult Edit(Student employee)
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
        public IActionResult Create(Student employee)
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

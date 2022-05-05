using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;

namespace SLD521FA1.Models
{
    public class Register
    {
        [Key]
        public string userName { get; set; }
        public string password { get; set; }
        public string confirmPassword { get; set; }
        public Register()
        {

        }
    }
}

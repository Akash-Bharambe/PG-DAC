using System.Globalization;
double money = 933234534.32d;
Console.OutputEncoding = System.Text.Encoding.UTF8;
//Console.WriteLine(string.Format(new CultureInfo("hi-IN"), "{0:c}",money));
Console.WriteLine(money.ToString("C",CultureInfo.CreateSpecificCulture("hi-IN")));

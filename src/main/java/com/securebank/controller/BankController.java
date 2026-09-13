package com.securebank.controller;
import com.securebank.pojo.DepositForm;
import com.securebank.pojo.RegisterForm;
import com.securebank.pojo.TransferForm;
import com.securebank.pojo.WithdrawForm;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankController {

 @GetMapping({"/","/login"}) public String login(HttpServletRequest req, Model m){
  String requestURI=req.getRequestURI();
  System.out.println(requestURI);
  m.addAttribute("mycurrentpage",requestURI);
  return "login";
 }

 @GetMapping("/register") public String register(HttpServletRequest req, Model m){
  String requestURI=req.getRequestURI();
  m.addAttribute("sita",new RegisterForm());
  System.out.println(requestURI);
  m.addAttribute("mycurrentpage",requestURI);
  return "register";
 }

 @GetMapping("/loginform")
 public String registerForm(@ModelAttribute RegisterForm ram, Model m){
  System.out.println(ram);
  System.out.println("hi,ram");
  return "login";
 }

 @GetMapping("/dashboard") public String dashboard(HttpServletRequest req, Model m){
  String requestURI=req.getRequestURI();
  System.out.println(requestURI);
  m.addAttribute("mycurrentpage",requestURI);
  return "dashboard";
 }

 @GetMapping("/account") public String account(HttpServletRequest req, Model m){
  String requestURI=req.getRequestURI();
  m.addAttribute("mycurrentpage",requestURI);
  return "account";
 }

 @GetMapping("/deposit") public String deposit(HttpServletRequest req, Model m){
  String requestURI=req.getRequestURI();
  m.addAttribute(requestURI);
  m.addAttribute("dita",new DepositForm());
  m.addAttribute("mycurrentpage",requestURI);
  return "deposit";
 }

 @GetMapping("/depositform") public String depositFrom(@ModelAttribute DepositForm deposit){
  System.out.println(deposit);
  return "deposit";
 }

 @GetMapping("/withdraw") public String withdraw(HttpServletRequest req, Model m){
  String requestURI=req.getRequestURI();
  m.addAttribute(requestURI);
  m.addAttribute("wita",new WithdrawForm());
  m.addAttribute("mycurrentpage",requestURI);
  return "withdraw";
 }

 @PostMapping("/withdrawform") public String withdrawForm(@ModelAttribute WithdrawForm withdraw){
  System.out.println(withdraw);
  return "withdraw";
 }

 @GetMapping("/transfer") public String transfer(HttpServletRequest req, Model m){
  String requestURI=req.getRequestURI();
  m.addAttribute(requestURI);
  m.addAttribute("tita",new TransferForm());
  m.addAttribute("mycurrentpage",requestURI);
  return "transfer";
 }

 @GetMapping("/transferform") public String transferForm(@ModelAttribute TransferForm tran){
  System.out.println(tran);
  return "transfer";
 }

 @GetMapping("/transactions") public String transactions(HttpServletRequest req, Model m){
  String requestURI=req.getRequestURI();
  m.addAttribute(requestURI);
  m.addAttribute("mycurrentpage",requestURI);
  return "transactions";}
}
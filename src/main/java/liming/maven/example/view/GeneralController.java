package liming.maven.example.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GeneralController {

	@RequestMapping(value="index.do")
	public void index_jsp(Model model){
		model.addAttribute("zhoulc", "黎明你好");
		System.out.println("index.jsp");
	}
	@RequestMapping(value="test.do")
	public void test_jsp(Model model){
		model.addAttribute("zhoulc", "big boss 你好");
		System.out.println("test.jsp");
	}
}

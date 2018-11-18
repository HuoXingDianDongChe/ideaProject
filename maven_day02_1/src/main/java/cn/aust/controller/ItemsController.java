package cn.aust.controller;

import cn.aust.domain.Items;
import cn.aust.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/con")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/find")
    public String findDatile(Model model){
        Items items = itemsService.findById(1);
        model.addAttribute("item",items);
        return "success";
    }
}

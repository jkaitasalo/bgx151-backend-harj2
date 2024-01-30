package bgx151.harj2.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import bgx151.harj2.domain.Friend;

	@Controller
	public class FriendController {
	
	    private List<Friend> friendList = new ArrayList<>();
		
//		3. Friend List
//		  @GetMapping("/friends")
//		  public String showFriends(Model model) {
//		      List<Friend> friendList = new ArrayList<>();
//		      friendList.add(new Friend("Jouni", "Jopoilija"));
//		      friendList.add(new Friend("Joona", "Jokinen"));
//		      friendList.add(new Friend("Janne", "Jankuttaja"));
//		
//		      model.addAttribute("friends", friendList);
//		
//		      return "friends";
//		  }
//	
//	    @GetMapping("/addFriend")
//	    public String showAddFriendForm(Model model) {
//	        model.addAttribute("friend", new Friend());
//	        return "addFriendForm";
//	    }
//	
//	    @PostMapping("/saveFriend")
//	    public String saveFriend(@ModelAttribute Friend friend) {
//	        friendList.add(friend);
//	        return "redirect:/friends";
//	    }

//			4. Friend List	    
	    @GetMapping("/friends")
	        public String showAddFriendForm(Model model) {
	            model.addAttribute("friend", new Friend());
	            model.addAttribute("friends", friendList);
	            return "friendsAndAddForm";
	        }

	        @PostMapping("/addFriend")
	        public String addFriend(@ModelAttribute Friend friend, Model model) {
	            friendList.add(friend);
	            model.addAttribute("friend", new Friend());
	            model.addAttribute("friends", friendList);
	            return "friendsAndAddForm";
	        }
}


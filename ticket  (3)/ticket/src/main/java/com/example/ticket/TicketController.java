package com.example.ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/create-ticket")
    public String getTickets(Model model) {

        List<Ticket> tickets = ticketRepository.findAllTickets();
        model.addAttribute("tickets", tickets);
        return "create-ticket";
    }

    @PostMapping("/create-ticket")
    public String createTicket(@RequestParam String title, @RequestParam String description, Authentication authentication) {
        //User user = userRepository.findByUsername(authentication.getName())
               // .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        Ticket ticket = new Ticket();
        ticket.setTitle(title);
        ticket.setDescription(description);
        ticket.setStatus("Open");

        ticketRepository.save(ticket);
        return "redirect:/tickets";
    }


    @GetMapping("/tickets")
    public String listTickets(Model model) {
        List<Ticket> tickets = ticketRepository.findAllTickets();
        model.addAttribute("tickets", tickets);
        return "tickets";  // This should be a view that lists all tickets
    }





    @GetMapping("/ticket/{id}")
    public String getTicketById(@PathVariable Long id, Model model) {
        Optional<Ticket> ticketOptional = ticketRepository.findById(id);

        if (ticketOptional.isPresent()) {
            model.addAttribute("ticket", ticketOptional.get());
            return "ticketDetails";  // Return the ticketDetails view
        } else {
            model.addAttribute("error", "Ticket not found");
            return "error";
        }
    }
    // Additional methods for ticket status update, etc.
    @PostMapping("/ticket/{id}/update-status")
    @Transactional
    public String updateStatus(@PathVariable Long id, @RequestParam String status, Model model) {
        Optional<Ticket> ticketOptional = ticketRepository.findById(id);

        if (ticketOptional.isPresent()) {
            ticketRepository.updateTicketStatus(id, status);
            return "redirect:/ticket/" + id; // Redirect back to ticket details
        } else {
            model.addAttribute("error", "Ticket not found.");
            return "error"; // Forward to error page
        }
    }
    @GetMapping("/ticket/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model) {
        Optional<Ticket> ticketOptional = ticketRepository.findById(id);
        if (ticketOptional.isPresent()) {
            model.addAttribute("ticket", ticketOptional.get());
            return "editTicket"; // View for editing ticket
        } else {
            model.addAttribute("error", "Ticket not found.");
            return "error";
        }
    }


    @PostMapping("/ticket/{id}/edit")
    public String updateTicket(@PathVariable Long id,
                               @RequestParam String title,
                               @RequestParam String description,
                               @RequestParam String status,
                               Model model) {
        Optional<Ticket> ticketOptional = ticketRepository.findById(id);
        if (ticketOptional.isPresent()) {
            Ticket ticket = ticketOptional.get();
            ticket.setTitle(title);
            ticket.setDescription(description);
            ticket.setStatus(status);
            ticketRepository.save(ticket);
            return "redirect:/ticket/" + id;
        } else {
            model.addAttribute("error", "Ticket not found.");
            return "error";
        }
    }
}











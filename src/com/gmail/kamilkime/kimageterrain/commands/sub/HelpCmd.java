package com.gmail.kamilkime.kimageterrain.commands.sub;

import org.bukkit.command.CommandSender;

import com.gmail.kamilkime.kimageterrain.commands.KCommand;
import com.gmail.kamilkime.kimageterrain.data.StringUtils;

public class HelpCmd implements KCommand {

	public void execute(CommandSender sender, String[] args) {
		sender.sendMessage(StringUtils.color("                      &8&l--------------------"));
		sender.sendMessage(StringUtils.color("&8&l� &a/kterrain info &8- &7Small info about the plugin :)"));
		sender.sendMessage(StringUtils.color("&8&l� &a/kterrain <arguments> &8- &7Main task creation command"));
		sender.sendMessage(StringUtils.color("&8&l� &a/kterrain vars &8- &7Shows all possible variables"));
		sender.sendMessage(StringUtils.color("&8&l� &a/kterrain images &8- &7Shows all available images"));
		sender.sendMessage(StringUtils.color("&8&l� &a/kterrain check <arguments> &8- &7Checks image's pixels"));
		sender.sendMessage(StringUtils.color("&8&l� &a/kterrain tasks &8- &7Shows all running tasks"));
		sender.sendMessage(StringUtils.color("&8&l� &a/kterrain task <taskID> <-t/-s/-ts> &8- &7Modifies task"));
		sender.sendMessage(StringUtils.color("&8&l� &a/kterrain accept <password> &8- &7Accepts prepared task"));
		sender.sendMessage(StringUtils.color("&8&l� &a/kterrain reload &8- &7Reloads the config file"));
		sender.sendMessage(StringUtils.color("                      &8&l--------------------"));
		return;
	}
}
package com.github.woostju.ansible.command;

import java.util.List;

import org.assertj.core.util.Lists;

import com.github.woostju.ansible.Module;

public class CmdCommand extends Command{

	
	public CmdCommand(List<String> hosts, String command) {
		this(hosts, command, null);
	}
	
	public CmdCommand(List<String> hosts, String command, List<String> options) {
		super(hosts, Module.command.toString(), Lists.newArrayList(command), options);
	}
}

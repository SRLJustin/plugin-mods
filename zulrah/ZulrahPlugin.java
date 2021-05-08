	@Subscribe
	private void onMenuEntryAdded(MenuEntryAdded event) {
		if (this.zulrah.isDead())
			return;
		if (event.getTarget().contains("Snakeling") && event.getOption().equalsIgnoreCase("attack")) {
			NPC npc = this.client.getCachedNPCs()[event.getIdentifier()];
			if (npc == null)
				return;
			this.client.setMenuEntries(Arrays.<MenuEntry>copyOf(this.client.getMenuEntries(), (this.client.getMenuEntries()).length - 1));
		}
	}
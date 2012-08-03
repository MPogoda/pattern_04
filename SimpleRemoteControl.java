package ua.patterns;

public class SimpleRemoteControl {
  Command slot;

  public void setCommand(Command command) {
    slot = command;
  }

  public void pressButton() {
    slot.execute();
  }
}

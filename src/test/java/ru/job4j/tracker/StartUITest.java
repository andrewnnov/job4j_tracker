package ru.job4j.tracker;

import org.junit.Test;

import javax.print.attribute.standard.MediaSize;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "Item name", "1"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(out), new ExitAction(out)};

        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replace item"));
        String replaceName = "New item name";
        Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), replaceName, "1"});

        UserAction[] actions = {new EditAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replaceName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), "1"});
        UserAction[] actions = {new DeleteAction(out), new ExitAction(out)};

        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new ExitAction(out)};

        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu:" + System.lineSeparator()
                + "0. Exit program" + System.lineSeparator()
                + "=== Exit program ===" + System.lineSeparator()));
    }

    @Test
    public void whenReplaceItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("Test1"));
        String replaceName = "New Test Name";
        Input in = new StubInput(new String[]{"0", String.valueOf(one.getId()), replaceName, "1"});
        UserAction[] actions = new UserAction[]{new EditAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Edit item" + ln
                        + "1. Exit program" + ln
                        + "=== Edit item ===" + ln
                        + "Заявка изменена успешно" + ln
                        + "Menu:" + ln
                        + "0. Edit item" + ln
                        + "1. Exit program" + ln
                        + "=== Exit program ===" + ln
        ));
    }

    @Test
    public void whenShowAllActionTestOutputSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("Test1"));
        Input in = new StubInput(new String[]{"0", "1"});
        UserAction[] actions = new UserAction[]{new ShowAllAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        String itemOne = one.toString();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Show all items" + ln
                        + "1. Exit program" + ln
                        + "=== Show all items ===" + ln
                        + itemOne + ln
                        + "Menu:" + ln
                        + "0. Show all items" + ln
                        + "1. Exit program" + ln
                        + "=== Exit program ===" + ln
        ));
    }

    @Test
    public void whenFindByNameActionTestOutputSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("Test1"));
        Input in = new StubInput(new String[]{"0", one.getName(), "1"});
        UserAction[] actions = new UserAction[]{new FindItemByNameAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        String itemOne = one.toString();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Find items by name" + ln
                        + "1. Exit program" + ln
                        + "=== Find items by name ===" + ln
                        + itemOne + ln
                        + "Menu:" + ln
                        + "0. Find items by name" + ln
                        + "1. Exit program" + ln
                        + "=== Exit program ===" + ln
        ));
    }

    @Test
    public void whenFindByIdActionTestOutputSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("Test1"));
        Input in = new StubInput(new String[]{"0", String.valueOf(one.getId()), "1"});
        UserAction[] actions = new UserAction[]{new FindItemByIdAction(out), new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        String itemOne = one.toString();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Find item by id" + ln
                        + "1. Exit program" + ln
                        + "=== Find item by id ===" + ln
                        + itemOne + ln
                        + "Menu:" + ln
                        + "0. Find item by id" + ln
                        + "1. Exit program" + ln
                        + "=== Exit program ===" + ln
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"5", "0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = new UserAction[]{
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Exit program" + ln
                        + "Wrong input, you can select: 0 .. 0" + ln
                        + "Menu:" + ln
                        + "0. Exit program" + ln
                        + "=== Exit program ===" + ln
        ));
    }

}
package org.eclipse.nebula.widgets.cdatetime;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.nebula.cwt.test.VTestCase;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

public class SelectionTests extends VTestCase {

	private CdtTester tester1;
	private CdtTester tester2;

	private void singleSelectionTest() {
		
		System.err.println("Single Selection Test");
		
		assertNull(tester1.getSelection());
		assertNotNull(tester1.getCalendarTime());

		Date date = new Date();
		tester1.setSelection(date);

		if((tester1.getStyle() & CDT.SIMPLE) == 0) {
			SimpleDateFormat sdf = new SimpleDateFormat(tester1.getPattern());
			assertEquals(sdf.format(date), tester1.getText());
		}
		assertEquals(date, tester1.getSelection());
		assertEquals(date, tester1.getCalendarTime());
	}

	private void dualSelectionTest() {
		System.err.println("dual Selection Test");

		assertNull(tester1.getSelection());
		assertNull(tester2.getSelection());
		
		Date date1 = new Date();
		Date date2 = new Date(System.currentTimeMillis()+10000);

		tester1.setSelection(date1);
		
		assertEquals(date1, tester1.getSelection());
		assertNull(tester2.getSelection());
		
		tester2.setSelection(date2);
		
		assertEquals(date1, tester1.getSelection());
		assertEquals(date2, tester2.getSelection());

		tester1.setSelection(null);
		
		assertNull(tester1.getSelection());
		assertEquals(date2, tester2.getSelection());
		
		tester2.setSelection(null);
		
		assertNull(tester1.getSelection());
		assertNull(tester2.getSelection());
	}

	public void setupBaseDateSelection() throws Exception {
		tester1 = new CdtTester(getShell(), CDT.BORDER | CDT.DATE_LONG);
	}
	
	public void testBaseDateSelection() {
		singleSelectionTest();
	}
	
	public void setupDropDownDateSelection() throws Exception {
		tester1 = new CdtTester(getShell(), CDT.BORDER | CDT.DATE_LONG | CDT.DROP_DOWN);
	}
	
	public void testDropDownDateSelection() {
		singleSelectionTest();
	}

	public void setupSimpleDateSelection() throws Exception {
		tester1 = new CdtTester(getShell(), CDT.BORDER | CDT.DATE_LONG | CDT.SIMPLE);
	}
	
	public void testSimpleDateSelection() {
		singleSelectionTest();
	}

	public void setupBaseDateTimeSelection() throws Exception {
		tester1 = new CdtTester(getShell(), CDT.BORDER | CDT.DATE_LONG | CDT.TIME_MEDIUM);
	}
	
	public void testBaseDateTimeSelection() {
		singleSelectionTest();
	}
	
	public void setupDropDownDateTimeSelection() throws Exception {
		tester1 = new CdtTester(getShell(), CDT.BORDER | CDT.DATE_LONG | CDT.TIME_MEDIUM | CDT.DROP_DOWN);
	}
	
	public void testDropDownDateTimeSelection() {
		singleSelectionTest();
	}

	public void setupSimpleDateTimeSelection() throws Exception {
		tester1 = new CdtTester(getShell(), CDT.BORDER | CDT.DATE_LONG | CDT.TIME_MEDIUM | CDT.SIMPLE);
	}
	
	public void testSimpleDateTimeSelection() {
		singleSelectionTest();
	}

	public void setupBaseTimeSelection() throws Exception {
		tester1 = new CdtTester(getShell(), CDT.BORDER | CDT.TIME_MEDIUM);
	}
	
	public void testBaseTimeSelection() {
		singleSelectionTest();
	}
	
	public void setupDropDownTimeSelection() throws Exception {
		tester1 = new CdtTester(getShell(), CDT.BORDER | CDT.TIME_MEDIUM | CDT.DROP_DOWN);
	}
	
	public void testDropDownTimeSelection() {
		singleSelectionTest();
	}

	public void setupSimpleTimeSelection() throws Exception {
		tester1 = new CdtTester(getShell(), CDT.BORDER | CDT.TIME_MEDIUM | CDT.SIMPLE);
	}
	
	public void testSimpleTimeSelection() {
		singleSelectionTest();
	}

	public void setupDualBaseDateSelection() throws Exception {
		tester1 = new CdtTester(getShell(), CDT.BORDER | CDT.DATE_LONG);
		tester2 = new CdtTester(getShell(), CDT.BORDER | CDT.DATE_LONG);
	}
	
	public void testDualBaseDateSelection() {
		dualSelectionTest();
	}
	
	public void setupDualDropDownDateSelection() throws Exception {
		tester1 = new CdtTester(getShell(), CDT.BORDER | CDT.DATE_LONG | CDT.DROP_DOWN);
		tester2 = new CdtTester(getShell(), CDT.BORDER | CDT.DATE_LONG | CDT.DROP_DOWN);
	}
	
	public void testDualDropDownDateSelection() {
		dualSelectionTest();
	}

	public void setupDualSimpleDateSelection() throws Exception {
		tester1 = new CdtTester(getShell(), CDT.BORDER | CDT.DATE_LONG | CDT.SIMPLE);
		tester2 = new CdtTester(getShell(), CDT.BORDER | CDT.DATE_LONG | CDT.SIMPLE);
	}
	
	public void testDualSimpleDateSelection() {
		dualSelectionTest();
	}

	public void setupDualBaseDateTimeSelection() throws Exception {
		tester1 = new CdtTester(getShell(), CDT.BORDER | CDT.DATE_LONG | CDT.TIME_MEDIUM);
		tester2 = new CdtTester(getShell(), CDT.BORDER | CDT.DATE_LONG | CDT.TIME_MEDIUM);
	}
	
	public void testDualBaseDateTimeSelection() {
		dualSelectionTest();
	}
	
	public void setupDualDropDownDateTimeSelection() throws Exception {
		tester1 = new CdtTester(getShell(), CDT.BORDER | CDT.DATE_LONG | CDT.TIME_MEDIUM | CDT.DROP_DOWN);
		tester2 = new CdtTester(getShell(), CDT.BORDER | CDT.DATE_LONG | CDT.TIME_MEDIUM | CDT.DROP_DOWN);
	}
	
	public void testDualDropDownDateTimeSelection() {
		dualSelectionTest();
	}

	public void setupDualSimpleDateTimeSelection() throws Exception {
		tester1 = new CdtTester(getShell(), CDT.BORDER | CDT.DATE_LONG | CDT.TIME_MEDIUM | CDT.SIMPLE);
		tester2 = new CdtTester(getShell(), CDT.BORDER | CDT.DATE_LONG | CDT.TIME_MEDIUM | CDT.SIMPLE);
	}
	
	public void testDualSimpleDateTimeSelection() {
		dualSelectionTest();
	}

	public void setupDualBaseTimeSelection() throws Exception {
		tester1 = new CdtTester(getShell(), CDT.BORDER | CDT.TIME_MEDIUM);
		tester2 = new CdtTester(getShell(), CDT.BORDER | CDT.TIME_MEDIUM);
	}
	
	public void testDualBaseTimeSelection() {
		dualSelectionTest();
	}
	
	public void setupDualDropDownTimeSelection() throws Exception {
		tester1 = new CdtTester(getShell(), CDT.BORDER | CDT.TIME_MEDIUM | CDT.DROP_DOWN);
		tester2 = new CdtTester(getShell(), CDT.BORDER | CDT.TIME_MEDIUM | CDT.DROP_DOWN);
	}
	
	public void testDualDropDownTimeSelection() {
		dualSelectionTest();
	}

	public void setupDualSimpleTimeSelection() throws Exception {
		tester1 = new CdtTester(getShell(), CDT.BORDER | CDT.TIME_MEDIUM | CDT.SIMPLE);
		tester2 = new CdtTester(getShell(), CDT.BORDER | CDT.TIME_MEDIUM | CDT.SIMPLE);
	}
	
	public void testDualSimpleTimeSelection() {
		dualSelectionTest();
	}

	boolean defaultSelected = false;
	boolean selected = false;
	private void resetSelecteds() {
		defaultSelected = false;
		selected = false;
	}
	
	public void setupSelectionListenerOnText() {
		tester1 = new CdtTester(getShell(), CDT.BORDER);
		tester1.setSelection(new Date());
		
		resetSelecteds();
		
		tester1.getCDateTime().addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				selected = true;
			}
			public void widgetDefaultSelected(SelectionEvent e) {
				defaultSelected = true;
			}
		});
	}

	public void testSelectionListenerOnText() {
		assertFalse(selected);
		assertFalse(defaultSelected);
		
		click(tester1.getTextWidget());

		keyPress(SWT.ARROW_UP);
		
		assertTrue(selected);
		assertFalse(defaultSelected);

		resetSelecteds();

		keyPress('\r');
		
		assertTrue(selected);
		assertTrue(defaultSelected);

		resetSelecteds();

		keyPress(SWT.KEYPAD_CR);
		
		assertTrue(selected);
		assertTrue(defaultSelected);
	}
	
}

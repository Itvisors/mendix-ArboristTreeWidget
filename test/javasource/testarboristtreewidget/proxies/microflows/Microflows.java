// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testarboristtreewidget.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	/**
	 * @deprecated
	 * The default constructor of the Microflows class should not be used.
	 * Use the static microflow invocation methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Microflows() {}

	// These are the microflows for the TestArboristTreeWidget module
	public static void aCT_TestContainer_OpenTreePage(IContext context, testarboristtreewidget.proxies.TestContainer _testContainer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TestContainer", _testContainer == null ? null : _testContainer.getMendixObject());
		Core.microflowCall("TestArboristTreeWidget.ACT_TestContainer_OpenTreePage").withParams(params).execute(context);
	}
	public static boolean aCT_TestContainer_SaveNew(IContext context, testarboristtreewidget.proxies.TestContainer _testContainer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TestContainer", _testContainer == null ? null : _testContainer.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("TestArboristTreeWidget.ACT_TestContainer_SaveNew").withParams(params).execute(context);
	}
	public static void sUB_TestContainer_OpenTreePage(IContext context, testarboristtreewidget.proxies.TestContainer _testContainer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TestContainer", _testContainer == null ? null : _testContainer.getMendixObject());
		Core.microflowCall("TestArboristTreeWidget.SUB_TestContainer_OpenTreePage").withParams(params).execute(context);
	}
	public static boolean vAL_TestContainer(IContext context, testarboristtreewidget.proxies.TestContainer _testContainer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TestContainer", _testContainer == null ? null : _testContainer.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("TestArboristTreeWidget.VAL_TestContainer").withParams(params).execute(context);
	}
}

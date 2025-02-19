package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;
import java.lang.ref.Reference;
import javax.annotation.Nullable;


/**
 * A Tuple
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class TwoTuple_OnionMessageContentsMessageSendInstructionsZ extends CommonBase {
	TwoTuple_OnionMessageContentsMessageSendInstructionsZ(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.C2Tuple_OnionMessageContentsMessageSendInstructionsZ_free(ptr); }
	}

	/**
	 * 
	 */
	public OnionMessageContents get_a() {
		long ret = bindings.C2Tuple_OnionMessageContentsMessageSendInstructionsZ_get_a(this.ptr);
		Reference.reachabilityFence(this);
		if (ret >= 0 && ret <= 4096) { return null; }
		OnionMessageContents ret_hu_conv = new OnionMessageContents(null, ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(this); };
		return ret_hu_conv;
	}

	/**
	 * 
	 */
	public MessageSendInstructions get_b() {
		long ret = bindings.C2Tuple_OnionMessageContentsMessageSendInstructionsZ_get_b(this.ptr);
		Reference.reachabilityFence(this);
		if (ret >= 0 && ret <= 4096) { return null; }
		org.ldk.structs.MessageSendInstructions ret_hu_conv = org.ldk.structs.MessageSendInstructions.constr_from_ptr(ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(this); };
		return ret_hu_conv;
	}

	long clone_ptr() {
		long ret = bindings.C2Tuple_OnionMessageContentsMessageSendInstructionsZ_clone_ptr(this.ptr);
		Reference.reachabilityFence(this);
		return ret;
	}

	/**
	 * Creates a new tuple which has the same data as `orig`
	 * but with all dynamically-allocated buffers duplicated in new buffers.
	 */
	public TwoTuple_OnionMessageContentsMessageSendInstructionsZ clone() {
		long ret = bindings.C2Tuple_OnionMessageContentsMessageSendInstructionsZ_clone(this.ptr);
		Reference.reachabilityFence(this);
		if (ret >= 0 && ret <= 4096) { return null; }
		TwoTuple_OnionMessageContentsMessageSendInstructionsZ ret_hu_conv = new TwoTuple_OnionMessageContentsMessageSendInstructionsZ(null, ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(this); };
		return ret_hu_conv;
	}

	/**
	 * Creates a new C2Tuple_OnionMessageContentsMessageSendInstructionsZ from the contained elements.
	 */
	public static TwoTuple_OnionMessageContentsMessageSendInstructionsZ of(org.ldk.structs.OnionMessageContents a, org.ldk.structs.MessageSendInstructions b) {
		long ret = bindings.C2Tuple_OnionMessageContentsMessageSendInstructionsZ_new(a.ptr, b.ptr);
		Reference.reachabilityFence(a);
		Reference.reachabilityFence(b);
		if (ret >= 0 && ret <= 4096) { return null; }
		TwoTuple_OnionMessageContentsMessageSendInstructionsZ ret_hu_conv = new TwoTuple_OnionMessageContentsMessageSendInstructionsZ(null, ret);
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(ret_hu_conv); };
		if (ret_hu_conv != null) { ret_hu_conv.ptrs_to.add(a); };
		return ret_hu_conv;
	}

}

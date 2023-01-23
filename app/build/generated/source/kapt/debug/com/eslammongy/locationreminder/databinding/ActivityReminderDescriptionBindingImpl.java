package com.eslammongy.locationreminder.databinding;
import com.eslammongy.locationreminder.R;
import com.eslammongy.locationreminder.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityReminderDescriptionBindingImpl extends ActivityReminderDescriptionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.title_label, 5);
        sViewsWithIds.put(R.id.description_label, 6);
        sViewsWithIds.put(R.id.location_label, 7);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityReminderDescriptionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityReminderDescriptionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            );
        this.descriptionField.setTag(null);
        this.latlngField.setTag(null);
        this.locationField.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.titleField.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.reminderDataItem == variableId) {
            setReminderDataItem((com.eslammongy.locationreminder.locationreminders.reminderslist.ReminderDataItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setReminderDataItem(@Nullable com.eslammongy.locationreminder.locationreminders.reminderslist.ReminderDataItem ReminderDataItem) {
        this.mReminderDataItem = ReminderDataItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.reminderDataItem);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String reminderDataItemLocation = null;
        java.lang.Double reminderDataItemLongitude = null;
        com.eslammongy.locationreminder.locationreminders.reminderslist.ReminderDataItem reminderDataItem = mReminderDataItem;
        java.lang.String reminderDataItemTitle = null;
        java.lang.Double reminderDataItemLatitude = null;
        java.lang.String reminderDataItemDescription = null;
        java.lang.String latlngFieldAndroidStringLatLongSnippetReminderDataItemLatitudeReminderDataItemLongitude = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (reminderDataItem != null) {
                    // read reminderDataItem.location
                    reminderDataItemLocation = reminderDataItem.getLocation();
                    // read reminderDataItem.longitude
                    reminderDataItemLongitude = reminderDataItem.getLongitude();
                    // read reminderDataItem.title
                    reminderDataItemTitle = reminderDataItem.getTitle();
                    // read reminderDataItem.latitude
                    reminderDataItemLatitude = reminderDataItem.getLatitude();
                    // read reminderDataItem.description
                    reminderDataItemDescription = reminderDataItem.getDescription();
                }


                // read @android:string/lat_long_snippet
                latlngFieldAndroidStringLatLongSnippetReminderDataItemLatitudeReminderDataItemLongitude = latlngField.getResources().getString(R.string.lat_long_snippet, reminderDataItemLatitude, reminderDataItemLongitude);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.descriptionField, reminderDataItemDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.latlngField, latlngFieldAndroidStringLatLongSnippetReminderDataItemLatitudeReminderDataItemLongitude);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.locationField, reminderDataItemLocation);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleField, reminderDataItemTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): reminderDataItem
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
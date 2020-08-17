package awesome.vrund.customfontwidgets

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.TypedArray
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class FontEditText : AppCompatEditText {

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        setTypeface(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(context, attrs, defStyle) {
        setTypeface(context, attrs)
    }

    constructor(context: Context) : super(context)

    @SuppressLint("CustomViewStyleable")
    private fun setTypeface(context: Context?, attrs: AttributeSet?) {
        val a: TypedArray = context!!.obtainStyledAttributes(attrs, R.styleable.CustomTextView)
        val customFont = a.getString(R.styleable.CustomTextView_customFont)
        if (customFont != null) {
            val typeface = Typeface.createFromAsset(context.assets, "fonts/$customFont")
            super.setTypeface(typeface, getTypeface().style)
        }
        a.recycle()
    }

    fun setCustomFont(font: String) {
        val typeface = Typeface.createFromAsset(context.assets, "fonts/$font")
        super.setTypeface(typeface, getTypeface().style)
    }
}
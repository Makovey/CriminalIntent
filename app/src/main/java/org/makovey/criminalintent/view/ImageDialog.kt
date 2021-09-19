package org.makovey.criminalintent.view

import android.app.AlertDialog
import android.app.Dialog
import android.graphics.Bitmap
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.DialogFragment
import org.makovey.criminalintent.R
import org.makovey.criminalintent.utils.getScaledBitmap

private const val ARG_PATH = "file_path"

class ImageDialog : DialogFragment() {
    private lateinit var imageView: ImageView

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            val inflater = requireActivity().layoutInflater

            val view = inflater.inflate(R.layout.dialog_image, null)
            val imageView = view.findViewById<ImageView>(R.id.image_zoom_dialog)

            val filePath = arguments?.getString(ARG_PATH)
            if (filePath != null) {
                val bm: Bitmap = getScaledBitmap(filePath, requireActivity())
                imageView.setImageBitmap(bm)
            }

            builder.setView(view)

            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }


    fun newInstance(filePath: String): ImageDialog {
        val args = Bundle()
        args.putString(ARG_PATH, filePath)

        val imageDialog = ImageDialog()
        imageDialog.arguments = args

        return imageDialog
    }
}
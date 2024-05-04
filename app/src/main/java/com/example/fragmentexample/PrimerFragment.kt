package com.example.fragmentexample

import android.app.AlertDialog
import android.content.Context
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PrimerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PrimerFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_primer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Asigna los listeners a los botones "Ver más"
        view.findViewById<Button>(R.id.verMasIpa1).setOnClickListener {
            showPopup("Una IPA clásica con un perfil de sabor distintivo que combina notas cítricas y resinosas con un toque de pino fresco. Esta cerveza es conocida por" +
                    " su equilibrio entre el amargor del lúpulo y la dulzura de la malta, lo que la hace una opción perfecta para los amantes de las IPAs tradicionales.")
        }

        view.findViewById<Button>(R.id.verMasIpa2).setOnClickListener {
            showPopup("Esta IPA ofrece un equilibrio perfecto entre el amargor del lúpulo y las notas dulces de la malta. Con un carácter amargo pronunciado pero bien " +
                    "integrado, esta cerveza presenta sabores complejos que incluyen caramelo, cítricos y un ligero toque floral. Ideal para aquellos que buscan una IPA con " +
                    "carácter y complejidad.")
        }

        view.findViewById<Button>(R.id.verMasIpa3).setOnClickListener {
            showPopup("Una IPA robusta y lupulada que cautiva con su amargor pronunciado y su aroma resinoso. Esta cerveza presenta una combinación de sabores de lúpulo," +
                    " como pino y cítricos, equilibrados por una base de malta que aporta un ligero dulzor. Perfecta para los amantes de las IPAs intensas y con carácter.")
        }

        view.findViewById<Button>(R.id.verMasLager1).setOnClickListener {
            showPopup("Una cerveza lager mexicana refrescante y ligera, con un sabor suave y notas sutiles de maíz y malta. Esta cerveza presenta un equilibrio perfecto entre" +
                    " la dulzura de la malta y el ligero amargor del lúpulo, lo que la convierte en una opción ideal para disfrutar en cualquier ocasión.")
        }

        view.findViewById<Button>(R.id.verMasLager2).setOnClickListener {
            showPopup("Una lager ámbar con un carácter complejo y sabroso. Con notas de caramelo, tostado y un suave amargor floral, esta cerveza ofrece un equilibrio " +
                    "perfecto entre la dulzura de la malta y el amargor del lúpulo. Ideal para aquellos que buscan una cerveza fácil de beber pero llena de sabor.")
        }

        view.findViewById<Button>(R.id.verMasLager3).setOnClickListener {
            showPopup("La cerveza pilsner original, con más de 175 años de historia. Esta cerveza checa es conocida por su amargor suave y refrescante, su cuerpo ligero" +
                    " y su distintivo carácter floral y herbal. Con un final limpio y seco, esta cerveza es perfecta para los amantes de las cervezas ligeras y refrescantes.")
        }

        view.findViewById<Button>(R.id.verMasStout1).setOnClickListener {
            showPopup("Una stout irlandesa clásica, famosa por su cremosidad y su distintivo sabor a café y chocolate. Con una textura suave y sedosa y un cuerpo medio," +
                    " esta cerveza ofrece un equilibrio perfecto entre el amargor del lúpulo y la dulzura de la malta tostada. Ideal para aquellos que buscan una experiencia " +
                    "de sabor única y reconfortante.")
        }

        view.findViewById<Button>(R.id.verMasStout2).setOnClickListener {
            showPopup("Una stout robusta y compleja con sabores intensos de café, chocolate y avena. Con un cuerpo completo y cremoso y un final dulce y persistente," +
                    " esta cerveza es perfecta para disfrutar en el desayuno o como postre. Ideal para los amantes de las cervezas oscuras y con carácter.")
        }

        view.findViewById<Button>(R.id.verMasStout3).setOnClickListener {
            showPopup("Una stout Chingona!, con sabores tostados y un amargor pronunciado. Con notas de café Michoacano, chocolate Yucateco y canela, esta cerveza ofrece" +
                    " una experiencia de sabor intensa y satisfactoria. Perfecta para aquellos que buscan una cerveza oscura y robusta con un carácter distintivamente Mexicano.")
        }

        view.findViewById<Button>(R.id.verMasSmothie).setOnClickListener {
            showPopup("Una cerveza estilo smoothie con mango, lactosa y sal marina. Refrescante y exótica, esta cerveza presenta un equilibrio perfecto entre el " +
                    "dulzor del mango, la cremosidad de la lactosa y la salinidad de la sal marina. Ideal para aquellos que buscan una experiencia de sabor única y refrescante.")
        }
        // Agrega más listeners para los otros botones "Ver más" según sea necesario
    }

    private fun showPopup(texto: String) {
        val context = context
        val builder = AlertDialog.Builder(context)
        val inflater = layoutInflater
        val popupView = inflater.inflate(R.layout.pop_up_botones, null)

        // Encuentra el TextView en el layout del pop-up y establece el texto
        val textViewPopup = popupView.findViewById<TextView>(R.id.textViewPopup)
        textViewPopup.text = texto

        builder.setView(popupView)
        val dialog = builder.create()
        dialog.show()
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PrimerFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PrimerFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}


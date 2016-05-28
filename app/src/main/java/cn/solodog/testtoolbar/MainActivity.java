package cn.solodog.testtoolbar;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TextView textbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar)findViewById(R.id.mytoolbar);
        toolbar.inflateMenu(R.menu.toolbar_menu);
        //用布局文件自顶替替换title，可设置监听
//        toolbar.setTitle("Title");
//        toolbar.setTitleTextColor(Color.WHITE);
//        toolbar.setSubtitle("subtitle");
//        toolbar.setSubtitleTextColor(Color.WHITE);
        toolbar.setNavigationIcon(R.mipmap.ic_drawer_home);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"navigationlistenner",Toast.LENGTH_SHORT).show();
            }

        });
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int menuid=item.getItemId();
                switch (menuid)
                {
                    case R.id.m_search:
                        Toast.makeText(MainActivity.this,"search",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.m_notification:
                        Toast.makeText(MainActivity.this,"notification",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item1:
                        Toast.makeText(MainActivity.this,"item1",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item2:
                        Toast.makeText(MainActivity.this,"item2",Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }

        });

        textbtn=(TextView)findViewById(R.id.toolbarbtn);
        textbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"TitleClick",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

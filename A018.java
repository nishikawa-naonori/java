class A018 {
    public static void main( String[] args )
    {
        DrawTriangle2( 3, '%' );
       System.out.println();
        DrawTriangle2( 5, '#' );
        System.out.println();
        DrawTriangle2( 7, '@' );
    }
    
    static void DrawTriangle2( int size, char ch )
    {
        for( int i = 0 ; i < size ; i++ )   // iが3以下の間繰返す
        {


            for( int j = 0 ; j <= i ; j++ )   // iが0なので1回だけ実行
                System.out.print( ch );       // iが1なので2回だけ実行 
                                              // iが2なので3回だけ実行
            System.out.println();

        }
    }

}


// %
// %%
// %%%



// #
// ##
// ###
// ####
// #####




// @
// @@
// @@@
// @@@@
// @@@@@
// @@@@@@
// @@@@@@@